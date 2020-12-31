import android.app.Activity;
import android.graphics.Canvas;
import android.support.v4.widget.NestedScrollView;
import android.view.View;
import androidx.test.rule.ActivityTestRule;
import androidx.test.runner.AndroidJUnit4;
import com.example.android.testing.unittesting.basicunitandroidtest.MyActivity;
import org.easymock.EasyMock;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_643CE5F1ABB468C18D00FF2551B76384D371B832C993101DD8B990D0F1048BC2__1335864915 {
   @Rule
   public ActivityTestRule mActivityRule;

   @Test
   public void testCase() throws Exception {
      ActivityTestRule var2 = this.mActivityRule;
      Activity var3 = var2.getActivity();
      View var4 = var3.findViewById(2131296439);
      NestedScrollView var5 = (NestedScrollView)var4;
      Object var1 = EasyMock.createMock(Canvas.class);
      var5.draw((Canvas)var1);
   }

   public TestCase_643CE5F1ABB468C18D00FF2551B76384D371B832C993101DD8B990D0F1048BC2__1335864915() {
      ActivityTestRule var1 = new ActivityTestRule(MyActivity.class);
      this.mActivityRule = var1;
   }
}
