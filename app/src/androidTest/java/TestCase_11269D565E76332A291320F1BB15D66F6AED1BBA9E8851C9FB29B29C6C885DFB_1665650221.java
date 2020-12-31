import android.app.Activity;
import android.app.PictureInPictureParams;
import androidx.test.rule.ActivityTestRule;
import androidx.test.runner.AndroidJUnit4;
import com.example.android.testing.unittesting.basicunitandroidtest.MyActivity;
import org.easymock.EasyMock;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_11269D565E76332A291320F1BB15D66F6AED1BBA9E8851C9FB29B29C6C885DFB_1665650221 {
   @Rule
   public ActivityTestRule mActivityRule;

   @Test
   public void testCase() throws Exception {
      ActivityTestRule var2 = this.mActivityRule;
      Activity var3 = var2.getActivity();
      Object var1 = EasyMock.createMock(PictureInPictureParams.class);
      var3.setPictureInPictureParams((PictureInPictureParams)var1);
   }

   public TestCase_11269D565E76332A291320F1BB15D66F6AED1BBA9E8851C9FB29B29C6C885DFB_1665650221() {
      ActivityTestRule var1 = new ActivityTestRule(MyActivity.class);
      this.mActivityRule = var1;
   }
}
