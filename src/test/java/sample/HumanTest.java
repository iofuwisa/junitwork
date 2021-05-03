package sample;

import org.junit.Test;
import org.junit.Rule;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import static org.junit.Assert.fail;
import static org.junit.Assert.assertEquals;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.CoreMatchers.*;

import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;
import org.mockito.Mock;
import org.mockito.Mockito;
import static org.mockito.Mockito.reset;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.any;
import static org.mockito.Mockito.when;

import org.junit.runner.RunWith;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import org.apache.commons.lang3.reflect.FieldUtils;

import java.lang.Math;

// @RunWith(PowerMockRunner.class)
@PrepareForTest(Math.class)
public class HumanTest {

    @InjectMocks
    Human h;

    @Before
    public void initMocks() {
        MockitoAnnotations.initMocks(this);
        // reset(randMock);
    }

    @Test
    public void testHuman1() {
        String n = "name";
        String a = "address";
        Human h = new Human(n, a);
        // assertThat(Integer.valueOf(h.getMyNumber()), is(closeTo(0, 9999)));
        assertThat(h.getName(), is(n));
        assertThat(h.getAddr(), is(a));
    }

    @Test
    public void testHuman2() {

        PowerMockito.mockStatic(Math.class);
        Mockito.when(Math.random()).thenReturn(0.0);

        // doReturn(1).when(randMock).nextInt(10000);

        // try{
        //     PowerMockito.whenNew(Random.class).withNoArguments().thenReturn(randMock);
        // } catch(Exception e) {
        //     fail(e.getMessage());
        // }

        String n = "name";
        String a = "address";
        Human h = new Human(n, a);


        // try {
        //     FieldUtils.writeField(h, "rand", randMock, true);
        // } catch(Exception e) {
        //     fail(e.getMessage());
        // }

        assertEquals(0, h.getMyNumber());
        assertThat(h.getName(), is(n));
        assertThat(h.getAddr(), is(a));
    }
}