package Faceboot;


import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ivy
 */
public class Utils {
    
    private static final char[] HEX_ARRAY = "0123456789ABCDEF".toCharArray();
public static String BytesToHex(byte[] bytes) {
    char[] hexChars = new char[bytes.length * 2];
    for (int j = 0; j < bytes.length; j++) {
        int v = bytes[j] & 0xFF;
        hexChars[j * 2] = HEX_ARRAY[v >>> 4];
        hexChars[j * 2 + 1] = HEX_ARRAY[v & 0x0F];
    }
    return new String(hexChars);
}
    
    public static void ShowErrorMessage(String Error){
        JOptionPane.showMessageDialog(null, Error);
    }
}
