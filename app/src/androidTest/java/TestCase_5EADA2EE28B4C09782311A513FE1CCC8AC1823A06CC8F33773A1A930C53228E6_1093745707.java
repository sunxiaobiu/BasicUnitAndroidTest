import android.app.Activity;
import android.graphics.Bitmap;
import android.support.v4.print.PrintHelper;
import androidx.test.rule.ActivityTestRule;
import androidx.test.runner.AndroidJUnit4;
import com.example.android.testing.unittesting.basicunitandroidtest.MyActivity;
import org.easymock.EasyMock;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_5EADA2EE28B4C09782311A513FE1CCC8AC1823A06CC8F33773A1A930C53228E6_1093745707 {
   @Rule
   public ActivityTestRule mActivityRule;

   @Test
   public void testCase() throws Exception {
      ActivityTestRule var2 = this.mActivityRule;
      Activity var1 = var2.getActivity();
      PrintHelper var3 = new PrintHelper(var1);
      Object var4 = EasyMock.createMock(Bitmap.class);
      var3.printBitmap("PRINT_CODE", (Bitmap)var4);
   }

   public TestCase_5EADA2EE28B4C09782311A513FE1CCC8AC1823A06CC8F33773A1A930C53228E6_1093745707() {
      ActivityTestRule var1 = new ActivityTestRule(MyActivity.class);
      this.mActivityRule = var1;
   }
}
