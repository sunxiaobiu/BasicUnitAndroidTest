import android.app.Activity;
import android.content.DialogInterface.OnClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import androidx.appcompat.app.AlertDialog.Builder;
import androidx.test.rule.ActivityTestRule;
import androidx.test.runner.AndroidJUnit4;
import com.example.android.testing.unittesting.basicunitandroidtest.MyActivity;
import org.easymock.EasyMock;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_1C9DE12470E1FADA7AFA35AC9D19FC38891B38D1C1B4D01AA2398142224EAB9B_911320624 {
   @Rule
   public ActivityTestRule mActivityRule;

   @Test
   public void testCase() throws Exception {
      ActivityTestRule var3 = this.mActivityRule;
      Activity var1 = var3.getActivity();
      Builder var4 = new Builder(var1);
      Object var5 = EasyMock.createMock(ArrayAdapter.class);
      byte var2 = 1;
      var4.setSingleChoiceItems((ListAdapter)var5, var2, (OnClickListener)null);
   }

   public TestCase_1C9DE12470E1FADA7AFA35AC9D19FC38891B38D1C1B4D01AA2398142224EAB9B_911320624() {
      ActivityTestRule var1 = new ActivityTestRule(MyActivity.class);
      this.mActivityRule = var1;
   }
}
