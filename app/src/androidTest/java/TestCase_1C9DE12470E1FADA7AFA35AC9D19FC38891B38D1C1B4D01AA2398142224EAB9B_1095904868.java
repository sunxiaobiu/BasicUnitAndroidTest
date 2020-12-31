import android.app.Activity;
import android.content.Context;
import android.view.View;
import androidx.appcompat.widget.Toolbar;
import androidx.test.rule.ActivityTestRule;
import androidx.test.runner.AndroidJUnit4;
import com.example.android.testing.unittesting.basicunitandroidtest.MyActivity;
import org.easymock.EasyMock;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_1C9DE12470E1FADA7AFA35AC9D19FC38891B38D1C1B4D01AA2398142224EAB9B_1095904868 {
   @Rule
   public ActivityTestRule mActivityRule;

   @Test
   public void testCase() throws Exception {
      ActivityTestRule var2 = this.mActivityRule;
      Activity var3 = var2.getActivity();
      View var4 = var3.findViewById(2131362868);
      Toolbar var5 = (Toolbar)var4;
      Object var1 = EasyMock.createMock(Context.class);
      var5.setSubtitleTextAppearance((Context)var1, 2131886111);
   }

   public TestCase_1C9DE12470E1FADA7AFA35AC9D19FC38891B38D1C1B4D01AA2398142224EAB9B_1095904868() {
      ActivityTestRule var1 = new ActivityTestRule(MyActivity.class);
      this.mActivityRule = var1;
   }
}
