import android.app.Activity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.SearchView;
import androidx.test.rule.ActivityTestRule;
import androidx.test.runner.AndroidJUnit4;
import com.example.android.testing.unittesting.basicunitandroidtest.MyActivity;
import org.easymock.EasyMock;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_63147E0A8BC983897D23AE728E025C584E6253AFBFD1E28A54FF1B8361545FC0__748506724 {
   @Rule
   public ActivityTestRule mActivityRule;

   @Test
   public void testCase() throws Exception {
      ActivityTestRule var1 = this.mActivityRule;
      Activity var2 = var1.getActivity();
      Object var3 = EasyMock.createMock(Menu.class);
      MenuItem var4 = ((Menu)var3).findItem(2131296857);
      View var5 = var4.getActionView();
      SearchView var6 = (SearchView)var5;
      var6.setTransitionGroup(true);
   }

   public TestCase_63147E0A8BC983897D23AE728E025C584E6253AFBFD1E28A54FF1B8361545FC0__748506724() {
      ActivityTestRule var1 = new ActivityTestRule(MyActivity.class);
      this.mActivityRule = var1;
   }
}
