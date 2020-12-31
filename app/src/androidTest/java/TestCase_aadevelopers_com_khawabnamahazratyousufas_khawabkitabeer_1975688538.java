import android.app.Activity;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import androidx.test.rule.ActivityTestRule;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_aadevelopers_com_khawabnamahazratyousufas_khawabkitabeer_1975688538 {
   @Test
   public void testCase() throws Exception {
      ActivityTestRule var3 = new ActivityTestRule(Activity.class);
      Activity var4 = var3.getActivity();
      Object var1 = EasyMock.createMock(View.class);
      Object var2 = EasyMock.createMock(LayoutParams.class);
      var4.setContentView((View)var1, (LayoutParams)var2);
   }
}
