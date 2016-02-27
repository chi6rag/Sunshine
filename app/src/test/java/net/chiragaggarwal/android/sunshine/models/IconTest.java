package net.chiragaggarwal.android.sunshine.models;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class IconTest {
    @Test
    public void clearDaySkyCodeForAForecastShouldRepresentClearSkyIcon() {
        assertEquals(Icon.CLEAR_SKY, Icon.parse("01d"));
    }

    @Test
    public void clearDaySkyIconShouldHave01dCode() {
        assertEquals("01d", Icon.CLEAR_SKY.code());
    }

    @Test
    public void clearNightSkyCodeForAForecastShouldRepresentClearSkyIcon() {
        assertEquals(Icon.CLEAR_SKY_NIGHT, Icon.parse("01n"));
    }

    @Test
    public void clearSkyNightIconShouldHave01nCode() {
        assertEquals("01n", Icon.CLEAR_SKY_NIGHT.code());
    }

    @Test
    public void fewCloudsDayIconCodeShouldRepresentLightCloudsIcon() {
        assertEquals(Icon.LIGHT_CLOUDS, Icon.parse("02d"));
    }

    @Test
    public void fewCloudsNightIconCodeShouldRepresentLightCloudsIcon() {
        assertEquals(Icon.LIGHT_CLOUDS_NIGHT, Icon.parse("02n"));
    }

    @Test
    public void scatteredCloudsDayIconCodeShouldRepresentCloudyIcon() {
        assertEquals(Icon.CLOUDY, Icon.parse("03d"));
    }

    @Test
    public void scatteredCloudsNightIconCodeShouldRepresentCloudyIcon() {
        assertEquals(Icon.CLOUDY_NIGHT, Icon.parse("03n"));
    }

    @Test
    public void brokenCloudsDayIconCodeShouldRepresentCloudyIcon() {
        assertEquals(Icon.CLOUDY, Icon.parse("04d"));
    }

    @Test
    public void brokenCloudsNightIconCodeShouldRepresentCloudyIcon() {
        assertEquals(Icon.CLOUDY_NIGHT, Icon.parse("04n"));
    }

    @Test
    public void showerRainDayIconCodeShouldRepresentRainIcon() {
        assertEquals(Icon.RAIN, Icon.parse("09d"));
    }

    @Test
    public void showerRainNightIconCodeShouldRepresentRainIcon() {
        assertEquals(Icon.RAIN_NIGHT, Icon.parse("09n"));
    }

    @Test
    public void rainDayIconCodeShouldRepresentLightRainIcon() {
        assertEquals(Icon.LIGHT_RAIN, Icon.parse("10d"));
    }

    @Test
    public void rainNightIconCodeShouldRepresentLightRainIcon() {
        assertEquals(Icon.LIGHT_RAIN_NIGHT, Icon.parse("10n"));
    }

    @Test
    public void thunderstormDayIconCodeShouldRepresentStormIcon() {
        assertEquals(Icon.STORM, Icon.parse("11d"));
    }

    @Test
    public void thunderstormNightIconCodeShouldRepresentStormIcon() {
        assertEquals(Icon.STORM_NIGHT, Icon.parse("11n"));
    }

    @Test
    public void snowDayIconCodeShouldRepresentSnowIcon() {
        assertEquals(Icon.SNOW, Icon.parse("13d"));
    }

    @Test
    public void snowNightIconCodeShouldRepresentSnowIcon() {
        assertEquals(Icon.SNOW_NIGHT, Icon.parse("13n"));
    }

    @Test
    public void mistDayIconCodeShouldRepresentFogIcon() {
        assertEquals(Icon.FOG, Icon.parse("50d"));
    }

    @Test
    public void mistNightIconCodeShouldRepresentFogIcon() {
        assertEquals(Icon.FOG_NIGHT, Icon.parse("50n"));
    }
}