import android.app.Activity;
import android.view.View;
import androidx.core.view.ViewCompat;
import androidx.core.view.ViewPropertyAnimatorCompat;
import androidx.test.rule.ActivityTestRule;
import androidx.test.runner.AndroidJUnit4;
import com.example.android.testing.unittesting.basicunitandroidtest.MyActivity;
import java.util.ArrayList;
import java.util.Iterator;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_ar_com_lichtmaier_antenas__1949426546 {
   @Rule
   public ActivityTestRule mActivityRule;

   @Test
   public void testCase() throws Exception {
      ActivityTestRule var2 = this.mActivityRule;
      Activity var3 = var2.getActivity();
      ArrayList var4 = new ArrayList();
      Iterator var5 = var4.iterator();
      Object var6 = var5.next();
      View var7 = (View)var6;
      ViewPropertyAnimatorCompat var8 = ViewCompat.animate(var7);
      float var1 = 1.0F;
      var8.translationY(var1);
   }

   public TestCase_ar_com_lichtmaier_antenas__1949426546() {
      ActivityTestRule var1 = new ActivityTestRule(MyActivity.class);
      this.mActivityRule = var1;
   }
}
