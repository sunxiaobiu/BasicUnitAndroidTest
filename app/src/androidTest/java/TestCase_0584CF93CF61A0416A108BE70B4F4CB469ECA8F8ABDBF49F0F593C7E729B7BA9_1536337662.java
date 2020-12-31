import android.app.Activity;
import android.content.DialogInterface.OnClickListener;
import androidx.appcompat.app.AlertDialog.Builder;
import androidx.test.rule.ActivityTestRule;
import androidx.test.runner.AndroidJUnit4;
import com.example.android.testing.unittesting.basicunitandroidtest.MyActivity;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_0584CF93CF61A0416A108BE70B4F4CB469ECA8F8ABDBF49F0F593C7E729B7BA9_1536337662 {
   @Rule
   public ActivityTestRule mActivityRule;

   @Test
   public void testCase() throws Exception {
      ActivityTestRule var3 = this.mActivityRule;
      Activity var4 = var3.getActivity();
      Builder var1 = new Builder(var4);
      Builder var5 = var1.setTitle(2131690054);
      byte var6 = 1;
      Object var2 = null;
      var5.setSingleChoiceItems(2130903041, var6, (OnClickListener)var2);
   }

   public TestCase_0584CF93CF61A0416A108BE70B4F4CB469ECA8F8ABDBF49F0F593C7E729B7BA9_1536337662() {
      ActivityTestRule var1 = new ActivityTestRule(MyActivity.class);
      this.mActivityRule = var1;
   }
}
