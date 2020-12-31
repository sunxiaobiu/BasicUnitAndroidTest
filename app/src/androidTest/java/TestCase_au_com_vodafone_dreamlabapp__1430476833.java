import android.app.Activity;
import android.support.v7.widget.PopupMenu;
import android.view.Menu;
import android.view.View;
import androidx.test.rule.ActivityTestRule;
import androidx.test.runner.AndroidJUnit4;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_au_com_vodafone_dreamlabapp__1430476833 {
   @Test
   public void testCase() throws Exception {
      ActivityTestRule var2 = new ActivityTestRule(Activity.class);
      Activity var3 = var2.getActivity();
      PopupMenu var1 = new PopupMenu(var3, (View)null);
      Menu var4 = var1.getMenu();
   }
}
