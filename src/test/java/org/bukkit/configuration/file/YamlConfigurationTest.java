package org.bukkit.configuration.file;

import java.util.Map;
import org.junit.Test;
import static org.junit.Assert.*;

public  class YamlConfigurationTest extends FileConfigurationTest {
    @Override
    public YamlConfiguration getConfig() {
        return new YamlConfiguration();
    }
    
    @Override
    public String getTestValuesString() {
        return "integer: -2147483648\n" +
            "string: String Value\n" +
            "long: 9223372036854775807\n" +
            "true-boolean: true\n" +
            "false-boolean: false\n" +
            "vector:\n" +
            "  ==: Vector\n" +
            "  x: 12345.67\n" +
            "  y: 64.0\n" +
            "  z: -12345.6789\n" +
            "list:\n" + 
            "- 1\n" + 
            "- 2\n" + 
            "- 3\n" + 
            "- 4\n" + 
            "- 5\n";
    }

    @Test
    public void testSaveToStringWithheader() {
        YamlConfiguration config = getConfig();
        config.options().header("This is a sample\nheader.");
        
        for (Map.Entry<String, Object> entry : getTestValues().entrySet()) {
            config.set(entry.getKey(), entry.getValue());
        }
        
        String result = config.saveToString();
        String expected = "# This is a sample\n# header.\n" + getTestValuesString();
        
        assertEquals(expected, result);
    }

    @Test
    public void testSaveToStringWithIndent() {
        YamlConfiguration config = getConfig();
        config.options().indent(9);
        
        config.set("section.key", 1);
        
        String result = config.saveToString();
        String expected = "section:\n         key: 1\n";
        
        assertEquals(expected, result);
    }
}
