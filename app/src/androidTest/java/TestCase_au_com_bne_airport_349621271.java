import android.app.Activity;
import android.support.v4.widget.DrawerLayout;
import android.util.SparseArray;
import android.view.View;
import androidx.test.rule.ActivityTestRule;
import androidx.test.runner.AndroidJUnit4;
import com.example.android.testing.unittesting.basicunitandroidtest.MyActivity;
import org.easymock.EasyMock;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_au_com_bne_airport_349621271 {
   @Rule
   public ActivityTestRule mActivityRule;

   @Test
   public void testCase() throws Exception {
      ActivityTestRule var2 = this.mActivityRule;
      Activity var3 = var2.getActivity();
      View var4 = var3.findViewById(2131689632);
      DrawerLayout var5 = (DrawerLayout)var4;
      Object var1 = EasyMock.createMock(SparseArray.class);
      var5.saveHierarchyState((SparseArray)var1);
   }

   public TestCase_au_com_bne_airport_349621271() {
      ActivityTestRule var1 = new ActivityTestRule(MyActivity.class);
      this.mActivityRule = var1;
   }
}
