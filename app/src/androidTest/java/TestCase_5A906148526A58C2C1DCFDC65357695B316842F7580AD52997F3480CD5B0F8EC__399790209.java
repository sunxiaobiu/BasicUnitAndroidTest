import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.ActivityOptionsCompat;
import androidx.test.rule.ActivityTestRule;
import androidx.test.runner.AndroidJUnit4;
import com.example.android.testing.unittesting.basicunitandroidtest.MyActivity;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_5A906148526A58C2C1DCFDC65357695B316842F7580AD52997F3480CD5B0F8EC__399790209 {
   @Rule
   public ActivityTestRule mActivityRule;

   @Test
   public void testCase() throws Exception {
      ActivityTestRule var1 = this.mActivityRule;
      Activity var2 = var1.getActivity();
      Context var3 = (Context)var2;
      ActivityOptionsCompat var4 = ActivityOptionsCompat.makeCustomAnimation(var3, 2130771990, 2130771990);
      Bundle var5 = var4.toBundle();
   }

   public TestCase_5A906148526A58C2C1DCFDC65357695B316842F7580AD52997F3480CD5B0F8EC__399790209() {
      ActivityTestRule var1 = new ActivityTestRule(MyActivity.class);
      this.mActivityRule = var1;
   }
}
