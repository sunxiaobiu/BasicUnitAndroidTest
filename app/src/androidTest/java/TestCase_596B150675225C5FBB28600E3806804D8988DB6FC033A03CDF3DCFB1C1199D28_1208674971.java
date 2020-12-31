import android.graphics.Typeface;
import android.view.View;
import android.widget.TextView;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_596B150675225C5FBB28600E3806804D8988DB6FC033A03CDF3DCFB1C1199D28_1208674971 {
   @Test
   public void testCase() throws Exception {
      Object var1 = EasyMock.createMock(View.class);
      TextView var2 = (TextView)var1;
      Typeface var3 = var2.getTypeface();
      boolean var4 = var3.isItalic();
   }
}
