package net.vulkanmod.render.util;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MathUtilTest {

    @Test
    public void testSaturate() {
        assertEquals(0.0f, MathUtil.saturate(-0.5f), 0.0001f);
        assertEquals(0.0f, MathUtil.saturate(0.0f), 0.0001f);
        assertEquals(0.5f, MathUtil.saturate(0.5f), 0.0001f);
        assertEquals(1.0f, MathUtil.saturate(1.0f), 0.0001f);
        assertEquals(1.0f, MathUtil.saturate(1.5f), 0.0001f);
    }

    @Test
    public void testClampFloat() {
        assertEquals(10.0f, MathUtil.clamp(10.0f, 20.0f, 5.0f), 0.0001f);
        assertEquals(15.0f, MathUtil.clamp(10.0f, 20.0f, 15.0f), 0.0001f);
        assertEquals(20.0f, MathUtil.clamp(10.0f, 20.0f, 25.0f), 0.0001f);
    }

    @Test
    public void testClampInt() {
        assertEquals(10, MathUtil.clamp(10, 20, 5));
        assertEquals(15, MathUtil.clamp(10, 20, 15));
        assertEquals(20, MathUtil.clamp(10, 20, 25));
    }
}
