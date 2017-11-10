package org.qtum.wallet.utils;

import org.bitcoinj.core.NetworkParameters;
import org.bitcoinj.params.QtumMainNetParams;
import org.bitcoinj.params.QtumTestNetParams;


public class CurrentNetParams {

    public  CurrentNetParams(){}

    public static NetworkParameters getNetParams(){
        return QtumTestNetParams.get();
    }

    public static String getUrl(){
        return "http://593-qtum-walletapi.pixelplex-test.by"; //DEV NET
        //return "http://145.239.197.39:5931/";
    }
}
