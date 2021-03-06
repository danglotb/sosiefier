package fr.inria.diversify.util;

import spoon.reflect.code.CtLiteral;
import spoon.reflect.declaration.CtEnum;
import spoon.reflect.declaration.CtType;
import spoon.reflect.factory.Factory;
import spoon.reflect.reference.CtTypeReference;

import java.math.BigInteger;
import java.security.SecureRandom;
import java.util.Collections;
import java.util.List;

/**
 * Created by nharrand on 22/11/16.
 */
public class RandomLiteralFactory {
    public static byte toByte(byte[] data) {
        return (data == null || data.length == 0) ? 0x0 : data[0];
    }
    /* ========================= */
    public static short toShort(byte[] data) {
        if (data == null || data.length != 2) return 0x0;
        // ----------
        return (short)(
                (0xff & data[0]) << 8   |
                        (0xff & data[1]) << 0
        );
    }
    /* ========================= */
    public static char toChar(byte[] data) {
        if (data == null || data.length != 2) return 0x0;
        // ----------
        return (char)(
                (0xff & data[0]) << 8   |
                        (0xff & data[1]) << 0
        );
    }
    /* ========================= */
    public static int toInt(byte[] data) {
        if (data == null || data.length != 4) return 0x0;
        // ----------
        return (int)( // NOTE: type cast not necessary for int
                (0xff & data[0]) << 24  |
                        (0xff & data[1]) << 16  |
                        (0xff & data[2]) << 8   |
                        (0xff & data[3]) << 0
        );
    }
    /* ========================= */
    public static long toLong(byte[] data) {
        if (data == null || data.length != 8) return 0x0;
        // ----------
        return (long)(
                // (Below) convert to longs before shift because digits
                //         are lost with ints beyond the 32-bit limit
                (long)(0xff & data[0]) << 56  |
                        (long)(0xff & data[1]) << 48  |
                        (long)(0xff & data[2]) << 40  |
                        (long)(0xff & data[3]) << 32  |
                        (long)(0xff & data[4]) << 24  |
                        (long)(0xff & data[5]) << 16  |
                        (long)(0xff & data[6]) << 8   |
                        (long)(0xff & data[7]) << 0
        );
    }
    /* ========================= */
    public static float toFloat(byte[] data) {
        if (data == null || data.length != 4) return 0x0;
        // ---------- simple:
        return Float.intBitsToFloat(toInt(data));
    }
    /* ========================= */
    public static double toDouble(byte[] data) {
        if (data == null || data.length != 8) return 0x0;
        // ---------- simple:
        return Double.longBitsToDouble(toLong(data));
    }
    /* ========================= */
    public static boolean toBoolean(byte[] data) {
        return (data == null || data.length == 0) ? false : data[0] != 0x00;
    }
    /* ========================= */
    public static String createString() {
        SecureRandom random = new SecureRandom();
        return "v" + new BigInteger(130, random).toString(10);
    }

    public static CtLiteral randomValue(CtTypeReference t) {
        Factory f = t.getFactory();
        SecureRandom sr = new SecureRandom();
        byte b[];
        if(t.getActualClass() == byte.class) {
            b = new byte[1];
            sr.nextBytes(b);
            return f.Code().createLiteral(toByte(b));
        } else if (t.getActualClass() == short.class) {
            b = new byte[2];
            sr.nextBytes(b);
            return f.Code().createLiteral(toShort(b));
        } else if (t.getActualClass() == char.class) {
            b = new byte[2];
            sr.nextBytes(b);
            return f.Code().createLiteral(toChar(b));
        } else if (t.getActualClass() == int.class) {
            b = new byte[4];
            sr.nextBytes(b);
            return f.Code().createLiteral(toInt(b));
        } else if (t.getActualClass() == long.class) {
            b = new byte[8];
            sr.nextBytes(b);
            return f.Code().createLiteral(toLong(b));
        } else if (t.getActualClass() == float.class) {
            b = new byte[4];
            sr.nextBytes(b);
            return f.Code().createLiteral(toFloat(b));
        } else if (t.getActualClass() == double.class) {
            b = new byte[8];
            sr.nextBytes(b);
            return f.Code().createLiteral(toDouble(b));
        } else if (t.getActualClass() == boolean.class) {
            b = new byte[1];
            sr.nextBytes(b);
            if(b[0] <= 127) return f.Code().createLiteral(true);
            else return f.Code().createLiteral(false);
        } else {
            return f.Code().createLiteral(null);
        }
    }
}
