import android.content.ContentResolver;
import android.provider.Settings.System;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_04B07C28EF6C6B969F009C218B03E36523A2E8E31511EEDB55D0CF2D2A6E3284_751851625 {
   public static void testCase() throws Exception {
      Object var0 = EasyMock.createMock(ContentResolver.class);
      float var1 = System.getFloat((ContentResolver)var0, "font_scale");
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
