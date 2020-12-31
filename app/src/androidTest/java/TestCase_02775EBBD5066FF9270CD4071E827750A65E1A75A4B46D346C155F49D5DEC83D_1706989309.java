import android.app.Activity;
import android.print.PrintAttributes;
import android.print.PrintDocumentAdapter;
import android.print.PrintManager;
import androidx.test.rule.ActivityTestRule;
import androidx.test.runner.AndroidJUnit4;
import com.example.android.testing.unittesting.basicunitandroidtest.MyActivity;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_02775EBBD5066FF9270CD4071E827750A65E1A75A4B46D346C155F49D5DEC83D_1706989309 {
   @Rule
   public ActivityTestRule mActivityRule;

   @Test
   public void testCase() throws Exception {
      ActivityTestRule var3 = this.mActivityRule;
      Activity var4 = var3.getActivity();
      Object var5 = var4.getSystemService("print");
      PrintManager var6 = (PrintManager)var5;
      String var1 = "android";
      Object var2 = null;
      var6.print(var1, (PrintDocumentAdapter)var2, (PrintAttributes)null);
   }

   public TestCase_02775EBBD5066FF9270CD4071E827750A65E1A75A4B46D346C155F49D5DEC83D_1706989309() {
      ActivityTestRule var1 = new ActivityTestRule(MyActivity.class);
      this.mActivityRule = var1;
   }
}
