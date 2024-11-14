package kr.co.pionnet.hamonica2;

import java.util.HashMap;
import java.util.Map;

public class ParameterMap {
    private final Map<String, Object> parameters;

    public ParameterMap() {
        parameters = new HashMap<>();
    }

    public ParameterMap(Map<String, Object> parameters) {
        this.parameters = new HashMap<>(parameters);
    }

    public void put(String key, Object value) {
        parameters.put(key, value);
    }

    // Get methods for primitive types with default value
    public int getInt(String key, int defaultValue) {
        Object value = parameters.get(key);
        if (value instanceof Integer) {
            return (int) value;
        }
        return defaultValue;
    }

    public int getInt(String key) {
        return getInt(key, 0);
    }

    public long getLong(String key, long defaultValue) {
        Object value = parameters.get(key);
        if (value instanceof Long) {
            return (long) value;
        }
        return defaultValue;
    }

    public long getLong(String key) {
        return getLong(key, 0L);
    }

    public float getFloat(String key, float defaultValue) {
        Object value = parameters.get(key);
        if (value instanceof Float) {
            return (float) value;
        }
        return defaultValue;
    }

    public float getFloat(String key) {
        return getFloat(key, 0.0f);
    }

    public double getDouble(String key, double defaultValue) {
        Object value = parameters.get(key);
        if (value instanceof Double) {
            return (double) value;
        }
        return defaultValue;
    }

    public double getDouble(String key) {
        return getDouble(key, 0.0);
    }

    public boolean getBoolean(String key, boolean defaultValue) {
        Object value = parameters.get(key);
        if (value instanceof Boolean) {
            return (boolean) value;
        }
        return defaultValue;
    }

    public boolean getBoolean(String key) {
        return getBoolean(key, false);
    }


    public char getChar(String key, char defaultValue) {
        Object value = parameters.get(key);
        if (value instanceof Character) {
            return (char) value;
        }
        return defaultValue;
    }

    public char getChar(String key) {
        return getChar(key, '\u0000');
    }

    public byte getByte(String key, byte defaultValue) {
        Object value = parameters.get(key);
        if (value instanceof Byte) {
            return (byte) value;
        }
        return defaultValue;
    }

    public byte getByte(String key) {
        return getByte(key, (byte) 0);
    }

    public short getShort(String key, short defaultValue) {
        Object value = parameters.get(key);
        if (value instanceof Short) {
            return (short) value;
        }
        return defaultValue;
    }

    public short getShort(String key) {
        return getShort(key, (short) 0);
    }

    // Get methods for primitive wrapper types with default value
    public Integer getIntObject(String key, Integer defaultValue) {
        return get(key, Integer.class, defaultValue);
    }

    public Integer getIntObject(String key) {
        return get(key, Integer.class, null);
    }

    public Long getLongObject(String key, Long defaultValue) {
        return get(key, Long.class, defaultValue);
    }

    public Long getLongObject(String key) {
        return get(key, Long.class, null);
    }

    public Float getFloatObject(String key, Float defaultValue) {
        return get(key, Float.class, defaultValue);
    }

    public Float getFloatObject(String key) {
        return get(key, Float.class, null);
    }

    public Double getDoubleObject(String key, Double defaultValue) {
        return get(key, Double.class, defaultValue);
    }

    public Double getDoubleObject(String key) {
        return get(key, Double.class, null);
    }

    public Boolean getBooleanObject(String key, Boolean defaultValue) {
        return get(key, Boolean.class, defaultValue);
    }

    public Boolean getBooleanObject(String key) {
        return get(key, Boolean.class, null);
    }

    public Character getCharacterObject(String key, Character defaultValue) {
        return get(key, Character.class, defaultValue);
    }

    public Character getCharacterObject(String key) {
        return get(key, Character.class, null);
    }

    public Byte getByteObject(String key, Byte defaultValue) {
        return get(key, Byte.class, defaultValue);
    }

    public Byte getByteObject(String key) {
        return get(key, Byte.class, null);
    }

    public Short getShortObject(String key, Short defaultValue) {
        return get(key, Short.class, defaultValue);
    }

    public Short getShortObject(String key) {
        return get(key, Short.class, null);
    }

    // Generic method to get value with default
    @SuppressWarnings("unchecked")
    public <T> T get(String key, Class<T> type, T defaultValue) {
        Object value = parameters.get(key);
        if (value == null) {
            return defaultValue;
        }
        try {
            return type.cast(value);
        } catch (ClassCastException e) {
            printErrorMessage("타입 변환 오류: " + e.getMessage());
            return defaultValue;
        }
    }

    public <T> T get(String key, Class<T> type) {
        return get(key, type, null);
    }

    // Helper method to print error messages
    private void printErrorMessage(String message) {
        System.err.println(message);
    }

    // Override toString for debugging
    @Override
    public String toString() {
        return "ParameterMap{" +
                "parameters=" + parameters +
                '}';
    }

}