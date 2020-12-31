import android.app.Activity;
import android.view.MenuInflater;
import androidx.test.rule.ActivityTestRule;
import androidx.test.runner.AndroidJUnit4;
import com.example.android.testing.unittesting.basicunitandroidtest.MyActivity;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_0800C6B61769AE081A7B9BDAC61488257470B407FBB9200D847720542BA44599__469822122 {
   @Rule
   public ActivityTestRule mActivityRule;

   @Test
   public void testCase() throws Exception {
      ActivityTestRule var1 = this.mActivityRule;
      Activity var2 = var1.getActivity();
      MenuInflater var3 = var2.getMenuInflater();
   }

   public TestCase_0800C6B61769AE081A7B9BDAC61488257470B407FBB9200D847720542BA44599__469822122() {
      ActivityTestRule var1 = new ActivityTestRule(MyActivity.class);
      this.mActivityRule = var1;
   }
}
