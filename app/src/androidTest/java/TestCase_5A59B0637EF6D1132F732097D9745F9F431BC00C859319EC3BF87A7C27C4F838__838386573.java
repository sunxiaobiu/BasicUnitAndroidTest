import android.app.Activity;
import android.graphics.Rect;
import android.support.v4.widget.NestedScrollView;
import android.view.View;
import androidx.test.rule.ActivityTestRule;
import androidx.test.runner.AndroidJUnit4;
import com.example.android.testing.unittesting.basicunitandroidtest.MyActivity;
import org.easymock.EasyMock;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_5A59B0637EF6D1132F732097D9745F9F431BC00C859319EC3BF87A7C27C4F838__838386573 {
   @Rule
   public ActivityTestRule mActivityRule;

   @Test
   public void testCase() throws Exception {
      ActivityTestRule var2 = this.mActivityRule;
      Activity var3 = var2.getActivity();
      View var4 = var3.findViewById(2131296961);
      NestedScrollView var5 = (NestedScrollView)var4;
      Object var1 = EasyMock.createMock(Rect.class);
      var5.getHitRect((Rect)var1);
   }

   public TestCase_5A59B0637EF6D1132F732097D9745F9F431BC00C859319EC3BF87A7C27C4F838__838386573() {
      ActivityTestRule var1 = new ActivityTestRule(MyActivity.class);
      this.mActivityRule = var1;
   }
}
