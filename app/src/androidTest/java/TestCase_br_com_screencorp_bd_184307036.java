import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.AppCompatImageView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.test.rule.ActivityTestRule;
import androidx.test.runner.AndroidJUnit4;
import com.example.android.testing.unittesting.basicunitandroidtest.MyActivity;
import org.easymock.EasyMock;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_br_com_screencorp_bd_184307036 {
   @Rule
   public ActivityTestRule mActivityRule;

   @Test
   public void testCase() throws Exception {
      ActivityTestRule var2 = this.mActivityRule;
      Activity var3 = var2.getActivity();
      LayoutInflater var4 = LayoutInflater.from(var3);
      View var5 = var4.inflate(2130968631, (ViewGroup)null);
      RelativeLayout var6 = (RelativeLayout)var5;
      var5 = var6.findViewById(2131820817);
      AppCompatImageView var7 = (AppCompatImageView)var5;
      Object var1 = EasyMock.createMock(Drawable.class);
      var7.setBackgroundDrawable((Drawable)var1);
   }

   public TestCase_br_com_screencorp_bd_184307036() {
      ActivityTestRule var1 = new ActivityTestRule(MyActivity.class);
      this.mActivityRule = var1;
   }
}
