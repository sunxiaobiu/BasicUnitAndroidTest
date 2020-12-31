import android.app.Activity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.SpinnerAdapter;
import androidx.appcompat.widget.AppCompatSpinner;
import androidx.test.rule.ActivityTestRule;
import androidx.test.runner.AndroidJUnit4;
import com.example.android.testing.unittesting.basicunitandroidtest.MyActivity;
import org.easymock.EasyMock;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_068889AEB3A722F36FCC2D2196260A38140F9E75E1DBD6576398C8DE889FE1FF_830971859 {
   @Rule
   public ActivityTestRule mActivityRule;

   @Test
   public void testCase() throws Exception {
      ActivityTestRule var2 = this.mActivityRule;
      Activity var3 = var2.getActivity();
      View var4 = var3.findViewById(2131296624);
      AppCompatSpinner var5 = (AppCompatSpinner)var4;
      Object var1 = EasyMock.createMock(ArrayAdapter.class);
      var5.setAdapter((SpinnerAdapter)var1);
   }

   public TestCase_068889AEB3A722F36FCC2D2196260A38140F9E75E1DBD6576398C8DE889FE1FF_830971859() {
      ActivityTestRule var1 = new ActivityTestRule(MyActivity.class);
      this.mActivityRule = var1;
   }
}
