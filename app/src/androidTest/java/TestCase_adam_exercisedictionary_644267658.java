import android.support.v4.app.DialogFragment;
import android.support.v4.app.FragmentManager;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_adam_exercisedictionary_644267658 {
   @Test
   public void testCase() throws Exception {
      DialogFragment var2 = new DialogFragment();
      Object var1 = EasyMock.createMock(FragmentManager.class);
      var2.show((FragmentManager)var1, "Edit Log");
   }
}
