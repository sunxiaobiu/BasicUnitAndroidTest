import android.app.Activity;
import androidx.appcompat.app.AlertDialog.Builder;
import androidx.test.rule.ActivityTestRule;
import androidx.test.runner.AndroidJUnit4;
import com.example.android.testing.unittesting.basicunitandroidtest.MyActivity;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_0584CF93CF61A0416A108BE70B4F4CB469ECA8F8ABDBF49F0F593C7E729B7BA9_2066052307 {
   @Rule
   public ActivityTestRule mActivityRule;

   @Test
   public void testCase() throws Exception {
      ActivityTestRule var2 = this.mActivityRule;
      Activity var3 = var2.getActivity();
      Builder var1 = new Builder(var3);
      Builder var4 = var1.setTitle(2131690178);
      var4 = var4.setCancelable(true);
   }

   public TestCase_0584CF93CF61A0416A108BE70B4F4CB469ECA8F8ABDBF49F0F593C7E729B7BA9_2066052307() {
      ActivityTestRule var1 = new ActivityTestRule(MyActivity.class);
      this.mActivityRule = var1;
   }
}
