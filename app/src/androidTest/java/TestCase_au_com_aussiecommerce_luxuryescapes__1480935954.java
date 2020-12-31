import android.app.Activity;
import android.net.Uri;
import android.support.v4.content.CursorLoader;
import androidx.test.rule.ActivityTestRule;
import androidx.test.runner.AndroidJUnit4;
import com.example.android.testing.unittesting.basicunitandroidtest.MyActivity;
import org.easymock.EasyMock;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_au_com_aussiecommerce_luxuryescapes__1480935954 {
   @Rule
   public ActivityTestRule mActivityRule;

   @Test
   public void testCase() throws Exception {
      ActivityTestRule var2 = this.mActivityRule;
      Activity var1 = var2.getActivity();
      CursorLoader var3 = new CursorLoader(var1);
      Object var4 = EasyMock.createMock(Uri.class);
      var3.setUri((Uri)var4);
   }

   public TestCase_au_com_aussiecommerce_luxuryescapes__1480935954() {
      ActivityTestRule var1 = new ActivityTestRule(MyActivity.class);
      this.mActivityRule = var1;
   }
}
