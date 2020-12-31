import android.app.Activity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.ActionMode.Callback;
import androidx.test.rule.ActivityTestRule;
import androidx.test.runner.AndroidJUnit4;
import com.example.android.testing.unittesting.basicunitandroidtest.MyActivity;
import org.easymock.EasyMock;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_ar_com_cys_bac__522384774 {
   @Rule
   public ActivityTestRule mActivityRule;

   @Test
   public void testCase() throws Exception {
      ActivityTestRule var2 = this.mActivityRule;
      Activity var3 = var2.getActivity();
      View var4 = var3.findViewById(2131558637);
      Toolbar var5 = (Toolbar)var4;
      Object var1 = EasyMock.createMock(Callback.class);
      var5.startActionMode((Callback)var1);
   }

   public TestCase_ar_com_cys_bac__522384774() {
      ActivityTestRule var1 = new ActivityTestRule(MyActivity.class);
      this.mActivityRule = var1;
   }
}
