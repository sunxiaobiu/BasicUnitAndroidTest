import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_1EA33E295881960AE42C00CD515D9502309402F23454A881C07E8CAF7D0A06FF__510908008 {
   @Test
   public void testCase() throws Exception {
      DialogFragment var2 = new DialogFragment();
      Object var1 = EasyMock.createMock(FragmentTransaction.class);
      var2.show((FragmentTransaction)var1, "txn_tag");
   }
}
