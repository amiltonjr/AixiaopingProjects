package com.weslide.lovesmallscreen.models;

import com.google.gson.annotations.SerializedName;
import com.weslide.lovesmallscreen.core.BaseModel;
import com.weslide.lovesmallscreen.models.bean.HomePprmModel;

import java.util.List;

/**
 * Created by YY on 2017/6/14.
 */
public class SqgwModel extends BaseModel{

    @SerializedName("yhj")
    NfcpModel yhj;

    @SerializedName("ppth")
    NfcpModel ppth;

    @SerializedName("sqgwCategories")
    List<SqgwCategoriesModel> sqgwCategories;

    @SerializedName("pprm")
    List<HomePprmModel> pprm;

    public List<HomePprmModel> getBkrx() {
        return bkrx;
    }

    public void setBkrx(List<HomePprmModel> bkrx) {
        this.bkrx = bkrx;
    }

    public List<HomePprmModel> getPprm() {
        return pprm;
    }

    public void setPprm(List<HomePprmModel> pprm) {
        this.pprm = pprm;
    }

    @SerializedName("bkrx")
    List<HomePprmModel> bkrx;

    @SerializedName("sqgwTp")
    NfcpModel sqgwTp;

    public NfcpModel getNine2nine() {
        return nine2nine;
    }

    public void setNine2nine(NfcpModel nine2nine) {
        this.nine2nine = nine2nine;
    }

    public NfcpModel getYhj() {
        return yhj;
    }

    public void setYhj(NfcpModel yhj) {
        this.yhj = yhj;
    }

    public NfcpModel getPpth() {
        return ppth;
    }

    public void setPpth(NfcpModel ppth) {
        this.ppth = ppth;
    }

    public List<SqgwCategoriesModel> getSqgwCategories() {
        return sqgwCategories;
    }

    public void setSqgwCategories(List<SqgwCategoriesModel> sqgwCategories) {
        this.sqgwCategories = sqgwCategories;
    }

    public NfcpModel getSqgwTp() {
        return sqgwTp;
    }

    public void setSqgwTp(NfcpModel sqgwTp) {
        this.sqgwTp = sqgwTp;
    }

    @SerializedName("nineTonine")
    NfcpModel nine2nine;
}
