package ru.netology.service;

import org.testng.annotations.Test;
import org.testng.Assert;

class CashbackHackServiceTest {

    @Test
    void shouldCalculateRemainIfBelow1000() {

        CashbackHackService service = new CashbackHackService();

        int actual = service.remain(999);
        int expected = 1;

        Assert.assertEquals(actual, expected);
    }

    @Test
    void shouldCalculateRemainIfEqual() {

        CashbackHackService service = new CashbackHackService();

        int actual = service.remain(1000);
        int expected = 0;

        Assert.assertEquals(actual, expected);
    }

    @Test
    void shouldCalculateRemainIfUnder1000() {

        CashbackHackService service = new CashbackHackService();

        int actual = service.remain(1001);
        int expected = 999;

        Assert.assertEquals(actual, expected);
    }
}