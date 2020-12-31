import android.app.Activity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import androidx.test.rule.ActivityTestRule;
import androidx.test.runner.AndroidJUnit4;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_arproductions_andrew_expenselog_801315986 {
   @Test
   public void testCase() throws Exception {
      ActivityTestRule var1 = new ActivityTestRule(Activity.class);
      Activity var2 = var1.getActivity();
      View var3 = var2.findViewById(2131689623);
      Toolbar var4 = (Toolbar)var3;
      CharSequence var5 = var4.getTitle();
   }
}
