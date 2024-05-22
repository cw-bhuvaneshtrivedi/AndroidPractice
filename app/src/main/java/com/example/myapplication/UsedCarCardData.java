package com.example.myapplication;

public class UsedCarCardData {
    private String AbsureScore;
    private String largePicUrl;
    private String profileId;
    private String carName;
    private String city;
    private String usedCarDetail;
    private String priceNumeric;
    private String price;
    private String formattedPrice;
    private String kms;
    private String year;
    private String isPremium;
    private String updated;
    private String AreaName;
    private String MaskingNumber;
    private String CertifiedLogoUrl;
    private String InspectionText;
    private String HasWarranty;
    private String OriginalImgPath;
    private String HostUrl;
    private String deliveryText;
    private int deliveryCityId;
    private String shareUrl;
    private String smallPicUrl;
    private String Fuel;
    private String AdditionalFuel;
    private String GearBox;
    private String CertificationScore;
    private String financeEmi;
    private String financeLinkText;
    private int makeId;
    private int modelId;
    private int usedCarCityId;
    private String valuationUrl;
    private String valuationText;
    private String certProgLogoUrl;
    private boolean isChatAvailable;
    private String stockRecommendationsUrl;
    private int cwBasePackageId;
    private String dealerCarsUrl;
    private String photoCount;
    private String financeUrlV2;
    private String financeTextV2;
    private String moreCarsText;
    private String moreCarsLink;
    private String tagText;
    private String dealershipLogoUrl;
    private int bookingStatus;
    private String ctaText;
    private String notifyText;
    private String notifySubText;
    private String virtualPhoneNumber;
    private String emiText;
    private String emiCtaText;
    private EmiDetail emiDetail;
    private String stockId;
    private String formattedOriginalPrice;
    private int dealerId;
    private String sellerName;
    private boolean isTrusted;

    public UsedCarCardData(String absureScore, String largePicUrl, String profileId, String carName, String city, String usedCarDetail,
               String priceNumeric, String price, String formattedPrice, String kms, String year, String isPremium,
               String updated, String areaName, String maskingNumber, String certifiedLogoUrl, String inspectionText,
               String hasWarranty, String originalImgPath, String hostUrl, String deliveryText, int deliveryCityId,
               String shareUrl, String smallPicUrl, String fuel, String additionalFuel, String gearBox,
               String certificationScore, String financeEmi, String financeLinkText, int makeId, int modelId,
               int usedCarCityId, String valuationUrl, String valuationText, String certProgLogoUrl, boolean isChatAvailable,
               String stockRecommendationsUrl, int cwBasePackageId, String dealerCarsUrl, String photoCount,
               String financeUrlV2, String financeTextV2, String moreCarsText, String moreCarsLink, String tagText,
               String dealershipLogoUrl, int bookingStatus, String ctaText, String notifyText, String notifySubText,
               String virtualPhoneNumber, String emiText, String emiCtaText, EmiDetail emiDetail, String stockId,
               String formattedOriginalPrice, int dealerId, String sellerName, boolean isTrusted) {
        this.AbsureScore = absureScore;
        this.largePicUrl = largePicUrl;
        this.profileId = profileId;
        this.carName = carName;
        this.city = city;
        this.usedCarDetail = usedCarDetail;
        this.priceNumeric = priceNumeric;
        this.price = price;
        this.formattedPrice = formattedPrice;
        this.kms = kms;
        this.year = year;
        this.isPremium = isPremium;
        this.updated = updated;
        this.AreaName = areaName;
        this.MaskingNumber = maskingNumber;
        this.CertifiedLogoUrl = certifiedLogoUrl;
        this.InspectionText = inspectionText;
        this.HasWarranty = hasWarranty;
        this.OriginalImgPath = originalImgPath;
        this.HostUrl = hostUrl;
        this.deliveryText = deliveryText;
        this.deliveryCityId = deliveryCityId;
        this.shareUrl = shareUrl;
        this.smallPicUrl = smallPicUrl;
        this.Fuel = fuel;
        this.AdditionalFuel = additionalFuel;
        this.GearBox = gearBox;
        this.CertificationScore = certificationScore;
        this.financeEmi = financeEmi;
        this.financeLinkText = financeLinkText;
        this.makeId = makeId;
        this.modelId = modelId;
        this.usedCarCityId = usedCarCityId;
        this.valuationUrl = valuationUrl;
        this.valuationText = valuationText;
        this.certProgLogoUrl = certProgLogoUrl;
        this.isChatAvailable = isChatAvailable;
        this.stockRecommendationsUrl = stockRecommendationsUrl;
        this.cwBasePackageId = cwBasePackageId;
        this.dealerCarsUrl = dealerCarsUrl;
        this.photoCount = photoCount;
        this.financeUrlV2 = financeUrlV2;
        this.financeTextV2 = financeTextV2;
        this.moreCarsText = moreCarsText;
        this.moreCarsLink = moreCarsLink;
        this.tagText = tagText;
        this.dealershipLogoUrl = dealershipLogoUrl;
        this.bookingStatus = bookingStatus;
        this.ctaText = ctaText;
        this.notifyText = notifyText;
        this.notifySubText = notifySubText;
        this.virtualPhoneNumber = virtualPhoneNumber;
        this.emiText = emiText;
        this.emiCtaText = emiCtaText;
        this.emiDetail = emiDetail;
        this.stockId = stockId;
        this.formattedOriginalPrice = formattedOriginalPrice;
        this.dealerId = dealerId;
        this.sellerName = sellerName;
        this.isTrusted = isTrusted;
    }

    public static class EmiDetail {
        private DownPayment downPayment;
        private Interest interest;
        private Tenure tenure;

        public EmiDetail(DownPayment downPayment, Interest interest, Tenure tenure) {
            this.downPayment = downPayment;
            this.interest = interest;
            this.tenure = tenure;
        }

        public static class DownPayment {
            private double minimum;
            private double maximum;
            private double defaultAmount;

            public DownPayment(double minimum, double maximum, double defaultAmount) {
                this.minimum = minimum;
                this.maximum = maximum;
                this.defaultAmount = defaultAmount;
            }
        }

        public static class Interest {
            private double minimum;
            private double maximum;
            private double defaultRate;

            public Interest(double minimum, double maximum, double defaultRate) {
                this.minimum = minimum;
                this.maximum = maximum;
                this.defaultRate = defaultRate;
            }

        }

        public static class Tenure {
            private int minimum;
            private int maximum;
            private int defaultTenure;

            public Tenure(int minimum, int maximum, int defaultTenure) {
                this.minimum = minimum;
                this.maximum = maximum;
                this.defaultTenure = defaultTenure;
            }

        }

    }
}
