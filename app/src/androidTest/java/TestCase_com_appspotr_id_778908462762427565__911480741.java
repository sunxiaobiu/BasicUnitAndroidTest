import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RotateDrawable;
import android.view.View;
import android.widget.ImageView;
import androidx.test.rule.ActivityTestRule;
import androidx.test.runner.AndroidJUnit4;
import com.example.android.testing.unittesting.basicunitandroidtest.MyActivity;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_appspotr_id_778908462762427565__911480741 {
   @Rule
   public ActivityTestRule mActivityRule;

   @Test
   public void testCase() throws Exception {
      ActivityTestRule var1 = this.mActivityRule;
      Activity var2 = var1.getActivity();
      View var3 = var2.findViewById(2131558522);
      ImageView var4 = (ImageView)var3;
      Drawable var5 = var4.getDrawable();
      LayerDrawable var6 = (LayerDrawable)var5;
      var5 = var6.findDrawableByLayerId(2131558686);
      RotateDrawable var7 = (RotateDrawable)var5;
      var5 = var7.getDrawable();
   }

   public TestCase_com_appspotr_id_778908462762427565__911480741() {
      ActivityTestRule var1 = new ActivityTestRule(MyActivity.class);
      this.mActivityRule = var1;
   }
}
