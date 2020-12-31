import android.app.Activity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView.SmoothScroller;
import androidx.test.rule.ActivityTestRule;
import androidx.test.runner.AndroidJUnit4;
import com.example.android.testing.unittesting.basicunitandroidtest.MyActivity;
import org.easymock.EasyMock;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_aceplus_theikchan_koolpon__1574069022 {
   @Rule
   public ActivityTestRule mActivityRule;

   @Test
   public void testCase() throws Exception {
      ActivityTestRule var2 = this.mActivityRule;
      Activity var3 = var2.getActivity();
      LinearLayoutManager var1 = new LinearLayoutManager(var3);
      LinearLayoutManager var4 = var1;
      Object var5 = EasyMock.createMock(SmoothScroller.class);
      var4.startSmoothScroll((SmoothScroller)var5);
   }

   public TestCase_com_aceplus_theikchan_koolpon__1574069022() {
      ActivityTestRule var1 = new ActivityTestRule(MyActivity.class);
      this.mActivityRule = var1;
   }
}
