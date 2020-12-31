import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_01F43BBD70800267D46EDA936621C4DFFE292EBD59B3448689EBDE206501484E__1731961693 {
   @Test
   public void testCase() throws Exception {
      Object var2 = EasyMock.createMock(FragmentManager.class);
      FragmentTransaction var3 = ((FragmentManager)var2).beginTransaction();
      Object var1 = null;
      var3.add((Fragment)var1, "com.bumptech.glide.manager");
   }
}
