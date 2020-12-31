import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_33845F76A68FC8C243CD02A7E51A57987CA9E8C601ED115BE2677EFFC9E866CB__752305471 {
   @Test
   public void testCase() throws Exception {
      Object var1 = EasyMock.createMock(AppCompatActivity.class);
      FragmentManager var2 = ((AppCompatActivity)var1).getSupportFragmentManager();
      FragmentTransaction var3 = var2.beginTransaction();
      var3 = var3.setReorderingAllowed(false);
   }
}
