import android.app.Activity;
import android.support.v7.view.menu.MenuBuilder;
import android.support.v7.view.menu.MenuPopupHelper;
import android.support.v7.widget.PopupMenu;
import android.view.Menu;
import android.view.View;
import android.widget.TextView;
import androidx.test.rule.ActivityTestRule;
import androidx.test.runner.AndroidJUnit4;
import com.example.android.testing.unittesting.basicunitandroidtest.MyActivity;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_1467384B8AEDE7E80F61DA62396857ADA413CBD829F119A1DA3D3F065892C0BB_1815903816 {
   @Rule
   public ActivityTestRule mActivityRule;

   @Test
   public void testCase() throws Exception {
      ActivityTestRule var4 = this.mActivityRule;
      Activity var5 = var4.getActivity();
      View var1 = var5.findViewById(2131296335);
      TextView var6 = (TextView)var1;
      PopupMenu var2 = new PopupMenu(var5, var6);
      Menu var7 = var2.getMenu();
      MenuBuilder var8 = (MenuBuilder)var7;
      MenuPopupHelper var3 = new MenuPopupHelper(var5, var8, var6);
      var3.setForceShowIcon(true);
   }

   public TestCase_1467384B8AEDE7E80F61DA62396857ADA413CBD829F119A1DA3D3F065892C0BB_1815903816() {
      ActivityTestRule var1 = new ActivityTestRule(MyActivity.class);
      this.mActivityRule = var1;
   }
}
