import android.app.ActionBar;
import android.app.Activity;
import android.graphics.drawable.Drawable;
import androidx.test.rule.ActivityTestRule;
import androidx.test.runner.AndroidJUnit4;
import com.example.android.testing.unittesting.basicunitandroidtest.MyActivity;
import org.easymock.EasyMock;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_asus_filemanager__1238317070 {
   @Rule
   public ActivityTestRule mActivityRule;

   @Test
   public void testCase() throws Exception {
      ActivityTestRule var2 = this.mActivityRule;
      Activity var3 = var2.getActivity();
      ActionBar var4 = var3.getActionBar();
      Object var1 = EasyMock.createMock(Drawable.class);
      var4.setSplitBackgroundDrawable((Drawable)var1);
   }

   public TestCase_com_asus_filemanager__1238317070() {
      ActivityTestRule var1 = new ActivityTestRule(MyActivity.class);
      this.mActivityRule = var1;
   }
}
