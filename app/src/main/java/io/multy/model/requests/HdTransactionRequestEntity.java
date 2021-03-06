/*
 * Copyright 2018 Idealnaya rabota LLC
 * Licensed under Multy.io license.
 * See LICENSE for details
 */

package io.multy.model.requests;

import com.google.gson.annotations.SerializedName;

public class HdTransactionRequestEntity {

    @SerializedName("currencyid")
    private int currencyId;
    @SerializedName("networkid")
    private int networkId;
    @SerializedName("payload")
    private Payload payload;
    @SerializedName("JWT")
    private String jwtToken;

    public HdTransactionRequestEntity(int currencyId, int networkId, Payload payload) {
        this.currencyId = currencyId;
        this.networkId = networkId;
        this.payload = payload;
    }

    public HdTransactionRequestEntity(int currencyId, int networkId, Payload payload, String jwtToken) {
        this.currencyId = currencyId;
        this.networkId = networkId;
        this.payload = payload;
        this.jwtToken = jwtToken;
    }

    public static class Payload {
        @SerializedName("address")
        private String address;
        @SerializedName("addressindex")
        private int addressIndex;
        @SerializedName("walletindex")
        private int walletIndex;
        @SerializedName("transaction")
        private String transaction;
        @SerializedName("ishd")
        private boolean isHd = true;

        public Payload(String address, int addressIndex, int walletIndex, String transaction) {
            this.address = address;
            this.addressIndex = addressIndex;
            this.walletIndex = walletIndex;
            this.transaction = transaction;
        }

        public Payload(String address, int addressIndex, int walletIndex, String transaction, boolean isHd) {
            this.address = address;
            this.addressIndex = addressIndex;
            this.walletIndex = walletIndex;
            this.transaction = transaction;
            this.isHd = isHd;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        public int getAddressIndex() {
            return addressIndex;
        }

        public void setAddressIndex(int addressIndex) {
            this.addressIndex = addressIndex;
        }

        public int getWalletIndex() {
            return walletIndex;
        }

        public void setWalletIndex(int walletIndex) {
            this.walletIndex = walletIndex;
        }

        public String getTransaction() {
            return transaction;
        }

        public void setTransaction(String transaction) {
            this.transaction = transaction;
        }

        public boolean isHd() {
            return isHd;
        }

        public void setHd(boolean hd) {
            isHd = hd;
        }
    }
}
