import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentManager;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_03EAD099184A64E2883F91AF9B9980D03E2A5FD59C1085F98E4C958FBA47FD8A__1536303678 {
   @Test
   public void testCase() throws Exception {
      DialogFragment var3 = new DialogFragment();
      Object var1 = EasyMock.createMock(FragmentManager.class);
      String var2 = "android";
      var3.show((FragmentManager)var1, var2);
   }
}
