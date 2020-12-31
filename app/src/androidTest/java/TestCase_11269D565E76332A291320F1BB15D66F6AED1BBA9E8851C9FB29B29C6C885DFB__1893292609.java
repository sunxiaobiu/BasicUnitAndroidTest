import androidx.fragment.app.Fragment;
import androidx.fragment.app.Fragment.SavedState;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_11269D565E76332A291320F1BB15D66F6AED1BBA9E8851C9FB29B29C6C885DFB__1893292609 {
   @Test
   public void testCase() throws Exception {
      Object var2 = EasyMock.createMock(Fragment.class);
      Object var1 = EasyMock.createMock(SavedState.class);
      ((Fragment)var2).setInitialSavedState((SavedState)var1);
   }
}
