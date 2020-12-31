import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.appcompat.widget.Toolbar;
import androidx.test.rule.ActivityTestRule;
import androidx.test.runner.AndroidJUnit4;
import com.example.android.testing.unittesting.basicunitandroidtest.MyActivity;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_26D6DD114EBF4FE4AFA66DC7B86FF81E996CF47474DE2C9CD4704DD64B8216F3_1075311478 {
   @Rule
   public ActivityTestRule mActivityRule;

   @Test
   public void testCase() throws Exception {
      ActivityTestRule var1 = this.mActivityRule;
      Activity var2 = var1.getActivity();
      Object var3 = var2.getSystemService("layout_inflater");
      LayoutInflater var4 = (LayoutInflater)var3;
      View var5 = var4.inflate(2131492914, (ViewGroup)null);
      ViewParent var6 = var5.getParent();
      Toolbar var7 = (Toolbar)var6;
      var7.setContentInsetsAbsolute(0, 0);
   }

   public TestCase_26D6DD114EBF4FE4AFA66DC7B86FF81E996CF47474DE2C9CD4704DD64B8216F3_1075311478() {
      ActivityTestRule var1 = new ActivityTestRule(MyActivity.class);
      this.mActivityRule = var1;
   }
}
