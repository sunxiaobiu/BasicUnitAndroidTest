import android.app.Activity;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import androidx.test.rule.ActivityTestRule;
import androidx.test.runner.AndroidJUnit4;
import com.example.android.testing.unittesting.basicunitandroidtest.MyActivity;
import org.easymock.EasyMock;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_0249F7DE168C625C51A2A423806DEB8B2A1A2A00162DE39C1E7D338DF900531F__1339698124 {
   @Rule
   public ActivityTestRule mActivityRule;

   @Test
   public void testCase() throws Exception {
      ActivityTestRule var3 = this.mActivityRule;
      Activity var4 = var3.getActivity();
      Object var1 = EasyMock.createMock(View.class);
      Object var2 = EasyMock.createMock(LayoutParams.class);
      var4.setContentView((View)var1, (LayoutParams)var2);
   }

   public TestCase_0249F7DE168C625C51A2A423806DEB8B2A1A2A00162DE39C1E7D338DF900531F__1339698124() {
      ActivityTestRule var1 = new ActivityTestRule(MyActivity.class);
      this.mActivityRule = var1;
   }
}
