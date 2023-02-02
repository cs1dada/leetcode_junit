package leetcode.editor.en;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AESUtilTest {

    String xmlString = "xxxtest1110609"; //取得要傳送的xml字串
    String encodeKey = "www.pcc.gov.tw@20121029";
    byte rawKeyData[] = encodeKey.getBytes();
    AESUtil util;

    //    byte[] encryptedData = this.getEncryptFinanceDataByDES(rawKeyData, xmlString);
//    xmlString = new sun.misc.BASE64Encoder().encode(encryptedData); //得到最後要傳送的檔案內容
//
    @BeforeEach
    void setUp() {
        util = new AESUtil();
    }

    @Test
    void decode() {
    }

    @Test
    void getEncryptFinanceDataByDES() throws Exception {
        byte[] encryptedData = util.getEncryptFinanceDataByDES(rawKeyData, xmlString);
        System.out.println(encryptedData);
    }
}