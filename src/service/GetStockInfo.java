package service;

import com.buildstuff.crap.fi.model.Query;

import javax.net.ssl.HttpsURLConnection;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by vvennava on 3/29/15.
 */
public class GetStockInfo {
    private String GETSTOCKINFOQUOTES = "https://query.yahooapis.com/v1/public/yql?";
    private String stockParams =
            "q=select * from yahoo.finance.quotes where symbol in (\"YHOO\",\"AAPL\",\"GOOG\",\"MSFT\")" +
                    "&diagnostics=true" +
                    "&env=store://datatables.org/alltableswithkeys" +
                    "&callback=";
    private Map<String, String> urlParams = new HashMap<String, String>();

    private Query query;

    public GetStockInfo(String ticker) {
    }

    private Map<String, String> setUrlParams() {
        Map<String, String> params = new HashMap<String, String>();
        params.put("q", "select * from yahoo.finance.quotes where symbol in (\"YHOO\",\"AAPL\",\"GOOG\",\"MSFT\")");
        params.put("diagnostics", "true");
        params.put("env", "store://datatables.org/alltableswithkeys");
        params.put("callback", " ");
        return params;
    }

    public Query getStockInfo() {
        Reader reader = null;
        BufferedWriter writer = null;
        HttpsURLConnection httpsConnection = null;
        OutputStream os = null;
        final URL url;


        try {

            final String urlString = GETSTOCKINFOQUOTES;
            url = new URL(urlString + getQuery(setUrlParams()));
            System.out.println(urlString + getQuery(setUrlParams()));
            httpsConnection = (HttpsURLConnection) url.openConnection();
            httpsConnection.setRequestMethod("GET");
            httpsConnection.setRequestProperty("Accept", "application/xml");
            httpsConnection.setRequestProperty("Content-Type", "application/xml");
            httpsConnection.setDoOutput(false);
            httpsConnection.setDoInput(true);
            httpsConnection.setUseCaches(false);
            httpsConnection.setDefaultUseCaches(false);
            httpsConnection.setConnectTimeout(2000);
            httpsConnection.setReadTimeout(2000);

            reader = new BufferedReader(new InputStreamReader(httpsConnection.getInputStream(), Charset.forName("UTF-8")));
            return query = xmlToQuote(reader);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                reader.close();
                httpsConnection.disconnect();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    private Query xmlToQuote(Reader reader) {

        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(Query.class);
            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
            Query query = (Query) jaxbUnmarshaller.unmarshal(reader);
            return query;
        } catch (JAXBException e) {
            e.printStackTrace();
        }
        return null;
    }

    private String getQuery(Map<String, String> params) throws UnsupportedEncodingException {
        StringBuilder result = new StringBuilder();
        boolean first = true;

        for (Map.Entry<String, String> param : params.entrySet()) {
            if (first)
                first = false;
            else
                result.append("&");

            result.append(URLEncoder.encode(param.getKey(), "UTF-8"));
            result.append("=");
            result.append(URLEncoder.encode(param.getValue(), "UTF-8"));
        }

        return result.toString();
    }

    public static void main(String[] args) {

        GetStockInfo stockInfo = new GetStockInfo("SBUX");
        Query query = stockInfo.getStockInfo();
        System.out.println("Query" + query.getResults().getQuote().get(1).getName());
    }

}
