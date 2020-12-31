import android.content.res.Resources;
import android.graphics.BitmapFactory.Options;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import androidx.test.runner.AndroidJUnit4;
import java.io.InputStream;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_artech_mvdportalmovil3_MontevideoPortalAndroid_544690161 {
   public static void testCase() throws Exception {
      Object var0 = EasyMock.createMock(Resources.class);
      Object var1 = null;
      String var2 = "android";
      Object var3 = EasyMock.createMock(Options.class);
      Drawable.createFromResourceStream((Resources)var0, (TypedValue)null, (InputStream)var1, var2, (Options)var3);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
