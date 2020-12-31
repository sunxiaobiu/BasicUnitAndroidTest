import android.app.Activity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.State;
import androidx.test.rule.ActivityTestRule;
import androidx.test.runner.AndroidJUnit4;
import com.example.android.testing.unittesting.basicunitandroidtest.MyActivity;
import org.easymock.EasyMock;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_620293CB67CEF361B30BF559B3A98BC83BF168D980EA244670FD836DD4389906__1614762102 {
   @Rule
   public ActivityTestRule mActivityRule;

   @Test
   public void testCase() throws Exception {
      ActivityTestRule var3 = this.mActivityRule;
      Activity var4 = var3.getActivity();
      LinearLayoutManager var1 = new LinearLayoutManager(var4);
      LinearLayoutManager var5 = var1;
      Object var6 = EasyMock.createMock(RecyclerView.class);
      byte var2 = 1;
      var5.smoothScrollToPosition((RecyclerView)var6, (State)null, var2);
   }

   public TestCase_620293CB67CEF361B30BF559B3A98BC83BF168D980EA244670FD836DD4389906__1614762102() {
      ActivityTestRule var1 = new ActivityTestRule(MyActivity.class);
      this.mActivityRule = var1;
   }
}
