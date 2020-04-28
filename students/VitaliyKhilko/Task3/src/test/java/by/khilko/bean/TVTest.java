package by.khilko.bean;

import by.khilko.service.TvService;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TVTest {

    @Test
    void getModelTv() {
        TV newTv = new TV("Sony",25, 20,false);

        String message = "Should be return model tv";
        String expected = "Sony";
        String actual = newTv.getModelTv();

        assertEquals(expected, actual, message);
    }

    @Test
    void setModelTv() {
        TV newTv = new TV();
        newTv.setModelTv("Samsung");

        String message = "Should be set and return model tv";
        String expected = "Samsung";
        String actual = newTv.getModelTv();

        assertEquals(expected, actual, message);
    }

    @Test
    void getChannelTv() {
        TV newTv = new TV("Sony",25, 20,false);

        String message = "Should be return channel";
        int expected = 25;
        int actual = newTv.getChannelTv();

        assertEquals(expected, actual, message);
    }

    @Test
    void setChannelTv() {
        TV newTv = new TV();
        newTv.setChannelTv(15);

        String message = "Should be set and return channel";
        int expected = 15;
        int actual = newTv.getChannelTv();

        assertEquals(expected, actual, message);
    }

    @Test
    void getSoundTv() {
        TV newTv = new TV("Sony",25, 20,false);

        String message = "Should be return sound";
        int expected = 20;
        int actual = newTv.getSoundTv();

        assertEquals(expected, actual, message);
    }

    @Test
    void setSoundTv() {
        TV newTv = new TV("Sony",25, 20,false);
        newTv.setSoundTv(13);

        String message = "Should be set and return sound";
        int expected = 13;
        int actual = newTv.getSoundTv();

        assertEquals(expected, actual, message);
    }

    @Test
    void isWorksTv() {
        TV newTv = new TV("Sony",25, 20,false);

        String message = "Should be return works tv off";
        boolean expected = false;
        boolean actual = newTv.isWorksTv();

        assertEquals(expected, actual, message);
    }

    @Test
    void setWorksTv() {
        TV newTv = new TV("Sony",25, 20,true);
        newTv.setWorksTv(true);

        String message = "Should be set and return works tv on";
        boolean expected = true;
        boolean actual = newTv.isWorksTv();

        assertEquals(expected, actual, message);
    }

    @Test
    void testEquals() {
        TV newTv = new TV("Sony",25, 20,true);
        TV newTv2 = new TV("Sony",25, 20,true);

        String message = "Should be return equals two tv";
        boolean expected = true;
        boolean actual = newTv.equals(newTv2);

        assertEquals(expected, actual, message);
    }

    @Test
    void testHashCode() {
        TV newTv = new TV("Sony",25, 20,true);
        TV newTv2 = new TV("Sony",25, 20,true);

        String message = "Should be return equals two tv";
        int expected = newTv.hashCode();
        int actual = newTv2.hashCode();

        assertEquals(expected, actual, message);
    }

    @Test
    void testToString() {
        TV newTv = new TV("Sony",25, 20,true);

        String message = "Should be return toString TV";
        String expected = "TV{modelTv='Sony', channelTv=25, soundTv=20, worksTv=true}";
        String actual = newTv.toString();

        assertEquals(expected, actual, message);
    }
}