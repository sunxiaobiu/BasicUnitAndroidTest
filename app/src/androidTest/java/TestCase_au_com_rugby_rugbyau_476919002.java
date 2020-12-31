import android.content.res.Resources;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import android.graphics.BitmapFactory.Options;
import android.util.TypedValue;
import androidx.test.runner.AndroidJUnit4;
import java.io.InputStream;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_au_com_rugby_rugbyau_476919002 {
   public static void testCase() throws Exception {
      Object var0 = null;
      Object var1 = EasyMock.createMock(Rect.class);
      Object var2 = EasyMock.createMock(Options.class);
      BitmapFactory.decodeResourceStream((Resources)null, (TypedValue)null, (InputStream)var0, (Rect)var1, (Options)var2);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
