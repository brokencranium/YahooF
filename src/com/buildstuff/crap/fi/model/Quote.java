package com.buildstuff.crap.fi.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;

/**
 * Created by vvennava on 3/29/15.
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class Quote {
    @XmlAttribute
    private String symbol;
    @XmlElement
    private String Ask;
    @XmlElement
    private String AverageDailyVolume;
    @XmlElement
    private String Bid;
    @XmlElement
    private String AskRealtime;
    @XmlElement
    private String BidRealtime;
    @XmlElement
    private String BookValue;
    @XmlElement
    private String Change_PercentChange;
    @XmlElement
    private String Change;
    @XmlElement
    private String Commission;
    @XmlElement
    private String Currency;
    @XmlElement
    private String ChangeRealtime;
    @XmlElement
    private String AfterHoursChangeRealtime;
    @XmlElement
    private String DividendShare;
    @XmlElement
    private String LastTradeDate;
    @XmlElement
    private String TradeDate;
    @XmlElement
    private String EarningsShare;
    @XmlElement
    private String ErrorIndicationreturnedforsymbolchangedinvalid;
    @XmlElement
    private String EPSEstimateCurrentYear;
    @XmlElement
    private String EPSEstimateNextYear;
    @XmlElement
    private String EPSEstimateNextQuarter;
    @XmlElement
    private String DaysLow;
    @XmlElement
    private String DaysHigh;
    @XmlElement
    private String YearLow;
    @XmlElement
    private String YearHigh;
    @XmlElement
    private String HoldingsGainPercent;
    @XmlElement
    private String AnnualizedGain;
    @XmlElement
    private String HoldingsGain;
    @XmlElement
    private String HoldingsGainPercentRealtime;
    @XmlElement
    private String HoldingsGainRealtime;
    @XmlElement
    private String MoreInfo;
    @XmlElement
    private String OrderBookRealtime;
    @XmlElement
    private String MarketCapitalization;
    @XmlElement
    private String MarketCapRealtime;
    @XmlElement
    private String EBITDA;
    @XmlElement
    private String ChangeFromYearLow;
    @XmlElement
    private String PercentChangeFromYearLow;
    @XmlElement
    private String LastTradeRealtimeWithTime;
    @XmlElement
    private String ChangePercentRealtime;
    @XmlElement
    private String ChangeFromYearHigh;
    @XmlElement
    private String PercebtChangeFromYearHigh;
    @XmlElement
    private String LastTradeWithTime;
    @XmlElement
    private String LastTradePriceOnly;
    @XmlElement
    private String HighLimit;
    @XmlElement
    private String LowLimit;
    @XmlElement
    private String DaysRange;
    @XmlElement
    private String DaysRangeRealtime;
    @XmlElement
    private String FiftydayMovingAverage;
    @XmlElement
    private String TwoHundreddayMovingAverage;
    @XmlElement
    private String ChangeFromTwoHundreddayMovingAverage;
    @XmlElement
    private String PercentChangeFromTwoHundreddayMovingAverage;
    @XmlElement
    private String ChangeFromFiftydayMovingAverage;
    @XmlElement
    private String PercentChangeFromFiftydayMovingAverage;
    @XmlElement
    private String Name;
    @XmlElement
    private String Notes;
    @XmlElement
    private String Open;
    @XmlElement
    private String PreviousClose;
    @XmlElement
    private String PricePaid;
    @XmlElement
    private String ChangeinPercent;
    @XmlElement
    private String PriceSales;
    @XmlElement
    private String PriceBook;
    @XmlElement
    private String ExDividendDate;
    @XmlElement
    private String PERatio;
    @XmlElement
    private String DividendPayDate;
    @XmlElement
    private String PERatioRealtime;
    @XmlElement
    private String PEGRatio;
    @XmlElement
    private String PriceEPSEstimateCurrentYear;
    @XmlElement
    private String PriceEPSEstimateNextYear;
    @XmlElement
    private String Symbol;
    @XmlElement
    private String SharesOwned;
    @XmlElement
    private String ShortRatio;
    @XmlElement
    private String LastTradeTime;
    @XmlElement
    private String TickerTrend;
    @XmlElement
    private String OneyrTargetPrice;
    @XmlElement
    private String Volume;
    @XmlElement
    private String HoldingsValue;
    @XmlElement
    private String HoldingsValueRealtime;
    @XmlElement
    private String YearRange;
    @XmlElement
    private String DaysValueChange;
    @XmlElement
    private String DaysValueChangeRealtime;
    @XmlElement
    private String StockExchange;
    @XmlElement
    private String DividendYield;
    @XmlElement
    private String PercentChange;


    public Quote() {
    }

    public String getAsk() {
        return Ask;
    }

    public void setAsk(String ask) {
        Ask = ask;
    }

    public String getAverageDailyVolume() {
        return AverageDailyVolume;
    }

    public void setAverageDailyVolume(String averageDailyVolume) {
        AverageDailyVolume = averageDailyVolume;
    }

    public String getBid() {
        return Bid;
    }

    public void setBid(String bid) {
        Bid = bid;
    }

    public String getAskRealtime() {
        return AskRealtime;
    }

    public void setAskRealtime(String askRealtime) {
        AskRealtime = askRealtime;
    }

    public String getBidRealtime() {
        return BidRealtime;
    }

    public void setBidRealtime(String bidRealtime) {
        BidRealtime = bidRealtime;
    }

    public String getBookValue() {
        return BookValue;
    }

    public void setBookValue(String bookValue) {
        BookValue = bookValue;
    }

    public String getChange_PercentChange() {
        return Change_PercentChange;
    }

    public void setChange_PercentChange(String change_PercentChange) {
        Change_PercentChange = change_PercentChange;
    }

    public String getChange() {
        return Change;
    }

    public void setChange(String change) {
        Change = change;
    }

    public String getCommission() {
        return Commission;
    }

    public void setCommission(String commission) {
        Commission = commission;
    }

    public String getCurrency() {
        return Currency;
    }

    public void setCurrency(String currency) {
        Currency = currency;
    }

    public String getChangeRealtime() {
        return ChangeRealtime;
    }

    public void setChangeRealtime(String changeRealtime) {
        ChangeRealtime = changeRealtime;
    }

    public String getAfterHoursChangeRealtime() {
        return AfterHoursChangeRealtime;
    }

    public void setAfterHoursChangeRealtime(String afterHoursChangeRealtime) {
        AfterHoursChangeRealtime = afterHoursChangeRealtime;
    }

    public String getDividendShare() {
        return DividendShare;
    }

    public void setDividendShare(String dividendShare) {
        DividendShare = dividendShare;
    }

    public String getLastTradeDate() {
        return LastTradeDate;
    }

    public void setLastTradeDate(String lastTradeDate) {
        LastTradeDate = lastTradeDate;
    }

    public String getTradeDate() {
        return TradeDate;
    }

    public void setTradeDate(String tradeDate) {
        TradeDate = tradeDate;
    }

    public String getEarningsShare() {
        return EarningsShare;
    }

    public void setEarningsShare(String earningsShare) {
        EarningsShare = earningsShare;
    }

    public String getErrorIndicationreturnedforsymbolchangedinvalid() {
        return ErrorIndicationreturnedforsymbolchangedinvalid;
    }

    public void setErrorIndicationreturnedforsymbolchangedinvalid(String errorIndicationreturnedforsymbolchangedinvalid) {
        ErrorIndicationreturnedforsymbolchangedinvalid = errorIndicationreturnedforsymbolchangedinvalid;
    }

    public String getEPSEstimateCurrentYear() {
        return EPSEstimateCurrentYear;
    }

    public void setEPSEstimateCurrentYear(String EPSEstimateCurrentYear) {
        this.EPSEstimateCurrentYear = EPSEstimateCurrentYear;
    }

    public String getEPSEstimateNextYear() {
        return EPSEstimateNextYear;
    }

    public void setEPSEstimateNextYear(String EPSEstimateNextYear) {
        this.EPSEstimateNextYear = EPSEstimateNextYear;
    }

    public String getEPSEstimateNextQuarter() {
        return EPSEstimateNextQuarter;
    }

    public void setEPSEstimateNextQuarter(String EPSEstimateNextQuarter) {
        this.EPSEstimateNextQuarter = EPSEstimateNextQuarter;
    }

    public String getDaysLow() {
        return DaysLow;
    }

    public void setDaysLow(String daysLow) {
        DaysLow = daysLow;
    }

    public String getDaysHigh() {
        return DaysHigh;
    }

    public void setDaysHigh(String daysHigh) {
        DaysHigh = daysHigh;
    }

    public String getYearLow() {
        return YearLow;
    }

    public void setYearLow(String yearLow) {
        YearLow = yearLow;
    }

    public String getYearHigh() {
        return YearHigh;
    }

    public void setYearHigh(String yearHigh) {
        YearHigh = yearHigh;
    }

    public String getHoldingsGainPercent() {
        return HoldingsGainPercent;
    }

    public void setHoldingsGainPercent(String holdingsGainPercent) {
        HoldingsGainPercent = holdingsGainPercent;
    }

    public String getAnnualizedGain() {
        return AnnualizedGain;
    }

    public void setAnnualizedGain(String annualizedGain) {
        AnnualizedGain = annualizedGain;
    }

    public String getHoldingsGain() {
        return HoldingsGain;
    }

    public void setHoldingsGain(String holdingsGain) {
        HoldingsGain = holdingsGain;
    }

    public String getHoldingsGainPercentRealtime() {
        return HoldingsGainPercentRealtime;
    }

    public void setHoldingsGainPercentRealtime(String holdingsGainPercentRealtime) {
        HoldingsGainPercentRealtime = holdingsGainPercentRealtime;
    }

    public String getHoldingsGainRealtime() {
        return HoldingsGainRealtime;
    }

    public void setHoldingsGainRealtime(String holdingsGainRealtime) {
        HoldingsGainRealtime = holdingsGainRealtime;
    }

    public String getMoreInfo() {
        return MoreInfo;
    }

    public void setMoreInfo(String moreInfo) {
        MoreInfo = moreInfo;
    }

    public String getOrderBookRealtime() {
        return OrderBookRealtime;
    }

    public void setOrderBookRealtime(String orderBookRealtime) {
        OrderBookRealtime = orderBookRealtime;
    }

    public String getMarketCapitalization() {
        return MarketCapitalization;
    }

    public void setMarketCapitalization(String marketCapitalization) {
        MarketCapitalization = marketCapitalization;
    }

    public String getMarketCapRealtime() {
        return MarketCapRealtime;
    }

    public void setMarketCapRealtime(String marketCapRealtime) {
        MarketCapRealtime = marketCapRealtime;
    }

    public String getEBITDA() {
        return EBITDA;
    }

    public void setEBITDA(String EBITDA) {
        this.EBITDA = EBITDA;
    }

    public String getChangeFromYearLow() {
        return ChangeFromYearLow;
    }

    public void setChangeFromYearLow(String changeFromYearLow) {
        ChangeFromYearLow = changeFromYearLow;
    }

    public String getPercentChangeFromYearLow() {
        return PercentChangeFromYearLow;
    }

    public void setPercentChangeFromYearLow(String percentChangeFromYearLow) {
        PercentChangeFromYearLow = percentChangeFromYearLow;
    }

    public String getLastTradeRealtimeWithTime() {
        return LastTradeRealtimeWithTime;
    }

    public void setLastTradeRealtimeWithTime(String lastTradeRealtimeWithTime) {
        LastTradeRealtimeWithTime = lastTradeRealtimeWithTime;
    }

    public String getChangePercentRealtime() {
        return ChangePercentRealtime;
    }

    public void setChangePercentRealtime(String changePercentRealtime) {
        ChangePercentRealtime = changePercentRealtime;
    }

    public String getChangeFromYearHigh() {
        return ChangeFromYearHigh;
    }

    public void setChangeFromYearHigh(String changeFromYearHigh) {
        ChangeFromYearHigh = changeFromYearHigh;
    }

    public String getPercebtChangeFromYearHigh() {
        return PercebtChangeFromYearHigh;
    }

    public void setPercebtChangeFromYearHigh(String percebtChangeFromYearHigh) {
        PercebtChangeFromYearHigh = percebtChangeFromYearHigh;
    }

    public String getLastTradeWithTime() {
        return LastTradeWithTime;
    }

    public void setLastTradeWithTime(String lastTradeWithTime) {
        LastTradeWithTime = lastTradeWithTime;
    }

    public String getLastTradePriceOnly() {
        return LastTradePriceOnly;
    }

    public void setLastTradePriceOnly(String lastTradePriceOnly) {
        LastTradePriceOnly = lastTradePriceOnly;
    }

    public String getHighLimit() {
        return HighLimit;
    }

    public void setHighLimit(String highLimit) {
        HighLimit = highLimit;
    }

    public String getLowLimit() {
        return LowLimit;
    }

    public void setLowLimit(String lowLimit) {
        LowLimit = lowLimit;
    }

    public String getDaysRange() {
        return DaysRange;
    }

    public void setDaysRange(String daysRange) {
        DaysRange = daysRange;
    }

    public String getDaysRangeRealtime() {
        return DaysRangeRealtime;
    }

    public void setDaysRangeRealtime(String daysRangeRealtime) {
        DaysRangeRealtime = daysRangeRealtime;
    }

    public String getFiftydayMovingAverage() {
        return FiftydayMovingAverage;
    }

    public void setFiftydayMovingAverage(String fiftydayMovingAverage) {
        FiftydayMovingAverage = fiftydayMovingAverage;
    }

    public String getTwoHundreddayMovingAverage() {
        return TwoHundreddayMovingAverage;
    }

    public void setTwoHundreddayMovingAverage(String twoHundreddayMovingAverage) {
        TwoHundreddayMovingAverage = twoHundreddayMovingAverage;
    }

    public String getChangeFromTwoHundreddayMovingAverage() {
        return ChangeFromTwoHundreddayMovingAverage;
    }

    public void setChangeFromTwoHundreddayMovingAverage(String changeFromTwoHundreddayMovingAverage) {
        ChangeFromTwoHundreddayMovingAverage = changeFromTwoHundreddayMovingAverage;
    }

    public String getPercentChangeFromTwoHundreddayMovingAverage() {
        return PercentChangeFromTwoHundreddayMovingAverage;
    }

    public void setPercentChangeFromTwoHundreddayMovingAverage(String percentChangeFromTwoHundreddayMovingAverage) {
        PercentChangeFromTwoHundreddayMovingAverage = percentChangeFromTwoHundreddayMovingAverage;
    }

    public String getChangeFromFiftydayMovingAverage() {
        return ChangeFromFiftydayMovingAverage;
    }

    public void setChangeFromFiftydayMovingAverage(String changeFromFiftydayMovingAverage) {
        ChangeFromFiftydayMovingAverage = changeFromFiftydayMovingAverage;
    }

    public String getPercentChangeFromFiftydayMovingAverage() {
        return PercentChangeFromFiftydayMovingAverage;
    }

    public void setPercentChangeFromFiftydayMovingAverage(String percentChangeFromFiftydayMovingAverage) {
        PercentChangeFromFiftydayMovingAverage = percentChangeFromFiftydayMovingAverage;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getNotes() {
        return Notes;
    }

    public void setNotes(String notes) {
        Notes = notes;
    }

    public String getOpen() {
        return Open;
    }

    public void setOpen(String open) {
        Open = open;
    }

    public String getPreviousClose() {
        return PreviousClose;
    }

    public void setPreviousClose(String previousClose) {
        PreviousClose = previousClose;
    }

    public String getPricePaid() {
        return PricePaid;
    }

    public void setPricePaid(String pricePaid) {
        PricePaid = pricePaid;
    }

    public String getChangeinPercent() {
        return ChangeinPercent;
    }

    public void setChangeinPercent(String changeinPercent) {
        ChangeinPercent = changeinPercent;
    }

    public String getPriceSales() {
        return PriceSales;
    }

    public void setPriceSales(String priceSales) {
        PriceSales = priceSales;
    }

    public String getPriceBook() {
        return PriceBook;
    }

    public void setPriceBook(String priceBook) {
        PriceBook = priceBook;
    }

    public String getExDividendDate() {
        return ExDividendDate;
    }

    public void setExDividendDate(String exDividendDate) {
        ExDividendDate = exDividendDate;
    }

    public String getPERatio() {
        return PERatio;
    }

    public void setPERatio(String PERatio) {
        this.PERatio = PERatio;
    }

    public String getDividendPayDate() {
        return DividendPayDate;
    }

    public void setDividendPayDate(String dividendPayDate) {
        DividendPayDate = dividendPayDate;
    }

    public String getPERatioRealtime() {
        return PERatioRealtime;
    }

    public void setPERatioRealtime(String PERatioRealtime) {
        this.PERatioRealtime = PERatioRealtime;
    }

    public String getPEGRatio() {
        return PEGRatio;
    }

    public void setPEGRatio(String PEGRatio) {
        this.PEGRatio = PEGRatio;
    }

    public String getPriceEPSEstimateCurrentYear() {
        return PriceEPSEstimateCurrentYear;
    }

    public void setPriceEPSEstimateCurrentYear(String priceEPSEstimateCurrentYear) {
        PriceEPSEstimateCurrentYear = priceEPSEstimateCurrentYear;
    }

    public String getPriceEPSEstimateNextYear() {
        return PriceEPSEstimateNextYear;
    }

    public void setPriceEPSEstimateNextYear(String priceEPSEstimateNextYear) {
        PriceEPSEstimateNextYear = priceEPSEstimateNextYear;
    }

    public String getSymbol() {
        return Symbol;
    }

    public void setSymbol(String symbol) {
        Symbol = symbol;
    }

    public String getSharesOwned() {
        return SharesOwned;
    }

    public void setSharesOwned(String sharesOwned) {
        SharesOwned = sharesOwned;
    }

    public String getShortRatio() {
        return ShortRatio;
    }

    public void setShortRatio(String shortRatio) {
        ShortRatio = shortRatio;
    }

    public String getLastTradeTime() {
        return LastTradeTime;
    }

    public void setLastTradeTime(String lastTradeTime) {
        LastTradeTime = lastTradeTime;
    }

    public String getTickerTrend() {
        return TickerTrend;
    }

    public void setTickerTrend(String tickerTrend) {
        TickerTrend = tickerTrend;
    }

    public String getOneyrTargetPrice() {
        return OneyrTargetPrice;
    }

    public void setOneyrTargetPrice(String oneyrTargetPrice) {
        OneyrTargetPrice = oneyrTargetPrice;
    }

    public String getVolume() {
        return Volume;
    }

    public void setVolume(String volume) {
        Volume = volume;
    }

    public String getHoldingsValue() {
        return HoldingsValue;
    }

    public void setHoldingsValue(String holdingsValue) {
        HoldingsValue = holdingsValue;
    }

    public String getHoldingsValueRealtime() {
        return HoldingsValueRealtime;
    }

    public void setHoldingsValueRealtime(String holdingsValueRealtime) {
        HoldingsValueRealtime = holdingsValueRealtime;
    }

    public String getYearRange() {
        return YearRange;
    }

    public void setYearRange(String yearRange) {
        YearRange = yearRange;
    }

    public String getDaysValueChange() {
        return DaysValueChange;
    }

    public void setDaysValueChange(String daysValueChange) {
        DaysValueChange = daysValueChange;
    }

    public String getDaysValueChangeRealtime() {
        return DaysValueChangeRealtime;
    }

    public void setDaysValueChangeRealtime(String daysValueChangeRealtime) {
        DaysValueChangeRealtime = daysValueChangeRealtime;
    }

    public String getStockExchange() {
        return StockExchange;
    }

    public void setStockExchange(String stockExchange) {
        StockExchange = stockExchange;
    }

    public String getDividendYield() {
        return DividendYield;
    }

    public void setDividendYield(String dividendYield) {
        DividendYield = dividendYield;
    }

    public String getPercentChange() {
        return PercentChange;
    }

    public void setPercentChange(String percentChange) {
        PercentChange = percentChange;
    }
}
