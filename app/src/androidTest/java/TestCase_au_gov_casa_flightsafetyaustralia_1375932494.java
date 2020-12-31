import android.graphics.Paint;
import android.support.v4.view.ViewCompat;
import android.view.View;
import android.webkit.WebView;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_au_gov_casa_flightsafetyaustralia_1375932494 {
   public static void testCase() throws Exception {
      Object var0 = EasyMock.createMock(WebView.class);
      ViewCompat.setLayerType((View)var0, 1, (Paint)null);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
